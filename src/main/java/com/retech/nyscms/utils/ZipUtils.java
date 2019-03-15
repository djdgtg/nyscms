package com.retech.nyscms.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZipUtils {
	private static final Logger log = LoggerFactory.getLogger(ZipUtils.class);

	public static void createZip(String sourcePath, String zipPath) {
		FileOutputStream fos = null;
		ZipOutputStream zos = null;
		try {
			fos = new FileOutputStream(zipPath);
			zos = new ZipOutputStream(fos);
			writeZip(new File(sourcePath), "", zos);
		} catch (FileNotFoundException e) {
			log.error("ZipUtils createZip  Failed to create ZIP file", e);
		} finally {
			try {
				if (zos != null) {
					log.debug("ZipUtils createZip Create a ZIP file successfully! the path in:{}", zipPath);
					zos.close();
					// 压缩成功后，删除打包前的文件
					deleteFile(new File(sourcePath));
				}
			} catch (IOException e) {
				log.error("ZipUtils createZip  Failed to create ZIP file", e);
			}
		}
	}

	private static void writeZip(File file, String parentPath, ZipOutputStream zos) {
		if (file.exists()) {
			if (file.isDirectory()) {// 处理文件夹
				parentPath += file.getName() + File.separator;
				File[] files = file.listFiles();
				for (File f : files) {
					writeZip(f, parentPath, zos);
				}
			} else {
				FileInputStream fis = null;
				try {
					fis = new FileInputStream(file);
					ZipEntry ze = new ZipEntry(parentPath + file.getName());
					zos.putNextEntry(ze);
					byte[] content = new byte[1024];
					int len;
					while ((len = fis.read(content)) != -1) {
						zos.write(content, 0, len);
						zos.flush();
					}
				} catch (FileNotFoundException e) {
					log.error("ZipUtils createZip  Failed to create ZIP file", e);
				} catch (IOException e) {
					log.error("ZipUtils createZip  Failed to create ZIP file", e);
				} finally {
					try {
						if (fis != null) {
							fis.close();
						}
					} catch (IOException e) {
						log.error("ZipUtils createZip  Failed to create ZIP file", e);
					}
				}
			}
		}
	}

	/**
	 * 删除文件夹
	 * 
	 * @param file
	 */
	public static void deleteFile(File file) {
		if (file.exists()) { // 判断文件是否存在
			if (file.isFile()) { // 判断是否是文件
				file.delete();
			} else if (file.isDirectory()) { // 否则如果它是一个目录
				File files[] = file.listFiles(); // 声明目录下所有的文件 files[];
				for (int i = 0; i < files.length; i++) { // 遍历目录下所有的文件
					deleteFile(files[i]); // 把每个文件 用这个方法进行迭代
				}
			}
			file.delete();
		}
	}

}
