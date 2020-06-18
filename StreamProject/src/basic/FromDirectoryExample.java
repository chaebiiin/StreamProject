package basic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FromDirectoryExample {
	public static void main(String[] args) {
		//path 람다
		Path path = Paths.get("d:/program files");
		try {
			Stream<Path> stream = Files.list(path);
			stream.forEach((t)->
			System.out.println(t.getFileName()));
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

//		try {
//			Stream<Path> stream = Files.list(path);
//			stream.forEach(new Consumer<Path>() {
//
//				@Override
//				public void accept(Path t) {			
//				}
//			});
//			stream.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		//file
//		path = Paths.get("d:/Dev/git/StreamProject/StreamProject/src/basic/FromDirectoryExample.java");
		Stream<String> strStream;
		try {
			strStream = Files.lines(path);
			strStream.forEach(t ->System.out.println(t.toString()));
			strStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
