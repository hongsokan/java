package ch15.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirectoryToStream {

	public static void main(String[] args) throws IOException {
		System.out.println("list() 메서드 이용해 스트림 생성");
		Path path = Paths.get("");
		Stream<Path> sr1 = Files.list(path);
		sr1.forEach( p -> System.out.println(p.getFileName()) );
		
//		System.out.println("========================");
//		System.out.println("find() 메서드 이용해 스트림 생성");
//		Stream<Path> sr2 = Files.find(path, 100, (p, b) -> {
//			
//			
//		});
//		sr2.forEach( p -> System.out.println() );
	}

}
