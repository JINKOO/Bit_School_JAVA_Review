package kr.ac.smu.day13;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * File Class extends Object
 * 
 * 파일 및 디렉토리 정보를 알 수 있다.
 * (파일의 내용 수정은 할 수 없음);
 * 
 */
public class FileMain01 {

	public static void main(String[] args) {
		
		File fileObj = new File("iotest/a.txt");
		
		//filObj가 a.txt의 정보를 알아내겠다.
		
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		String path = fileObj.getPath();
		String absolutePath = fileObj.getAbsolutePath();
		
		System.out.println("파일 이름 : " + fileName);
		System.out.println("상위 폴더 : " + parent);
		System.out.println("상대 경로 : " + path);
		System.out.println("절대 경로 : " + absolutePath);
		
		System.out.println("=======================================");
		//아직 iotest/a.txt에 없음. 그냥 지정만 하고 있나 없나 확인 해야됨.
		
		if(fileObj.exists()) {
			System.out.println("a.txt파일이 존재합니다.");
		} else {
			System.out.println("a.txt파일이 존재하지 않습니다.");
		}
		
		long size = fileObj.length();
		System.out.println("파일의 크기 : " + size);
		
		boolean bool = fileObj.isFile();
		System.out.println(fileName + " : " + (bool ? "파일입니다." : "파일이 아닙니다."));
		
		bool = fileObj.isDirectory();
		System.out.println(fileName + " : " + (bool ? "디렉토리입니다." : "디렉토리 아닙니다."));
		
		long time = fileObj.lastModified();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("마지막 수정 날짜 : " + sdf.format(new Date(time)));
		
		bool = fileObj.canRead();
		System.out.println(fileName + " : " + (bool ? "읽기가능" : "읽기 불가능"));
		
		bool = fileObj.canWrite();
		System.out.println(fileName + " : " + (bool ? "쓰기 가능" : "쓰기 불가능"));
	}

	
}
