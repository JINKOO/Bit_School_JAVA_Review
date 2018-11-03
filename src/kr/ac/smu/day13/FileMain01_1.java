package kr.ac.smu.day13;

import java.io.File;

public class FileMain01_1 {

	public static void main(String[] args) {
		
		/**
		 *   디렉토리에 어떤 정보가 있는지 알고 싶다.
		 *   어떠한 파일들이 있나..
		 */
		File dirObj = new File("iotest");
		
		//iotest파일이 존재 하는지 판단.
		boolean bool = dirObj.exists();
		System.out.println((bool ? "존재합니다." : "No 존재"));
		
		//iotest가 디렉토리 인지 먼저 판단.
		bool = dirObj.isDirectory();
		System.out.println(dirObj.getName() + " : " + (bool? "is Directory" : "Not directory"));
		
		System.out.println("<<디렉토리 내 있는 파일 List>>");
		
		String[] list = dirObj.list();
		
		for(String names : list) {
			System.out.println(names);
		}
		
		System.out.println("======================");
		
		File[] files = dirObj.listFiles();
		for(File file : files) {
			System.out.println(file.getName());
			System.out.println("파일 크기 : " + file.length());
		}
		
		
		System.out.println("=============================");
		
		/**
		 * 
		 * mkdir() : 상위 폴더가 존재한다는 가정하에 생성한다.(없으면 생성 못함).
		 * mkdirs() : 자기 경로에 없는 것들 모두 만들고 생성.
		 * 
		 * but 이미 있다면 둘다 생성 실패 한다.
		 * 
		 */
//		dirObj = new File("iotest/새 폴더/test");
//		bool = dirObj.mkdir();
//		System.out.println(bool ? "생성 성공" : "생성 실패");
//		
		dirObj = new File("iotest/고진권/test");
		bool = dirObj.mkdirs();
		System.out.println(bool ? "생성 성공" : "생성 실패");
		
		System.out.println("==================================");
		
//		dirObj = new File("error.log");
//		bool = dirObj.delete();
//		System.out.println(bool ? "삭제 성공" : "삭제 실패");
	}
}
