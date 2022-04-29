import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void getlink() throws IOException{
        Path fileName = Path.of("myTestFile.md");
        String content = Files.readString(fileName);    
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> fileList = List.of("Chickenbutt","jhkjh");
        assertEquals(links, fileList);
    }
    @Test
    public void getlink2() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);    
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> fileList = List.of("https://something.com","some-thing.html");
        assertEquals(links, fileList);
    }
    @Test
    public void getlink3() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);    
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> fileList = List.of("https://something.co","some-thing.html");
        assertEquals(links, fileList);
}}