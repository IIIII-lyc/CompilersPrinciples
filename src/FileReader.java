import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
	
	private String fileName;
	private String outFileName;
	
	public FileReader(String fileName) {
		this.fileName = fileName;
	}
	
	public String readString() {
		StringBuilder sb = new StringBuilder();
		try {
			List<String> list = Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
			list.stream()
				.forEach(str -> {
					sb.append(str);
				});
			String str = sb.toString();
			str = StringResolver.resolve(str);
			return str;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("文件读取错误");
			e.printStackTrace();
			return null;
		}
	}
	
	public void writeResult(String str) {
		try {
			Files.write(Paths.get(outFileName),str.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("文件写入失败");
			e.printStackTrace();
		}
	}
	

}
