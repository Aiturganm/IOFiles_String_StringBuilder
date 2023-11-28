import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Song song = new Song();
        String file = "txt";

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("""  
                Кечки Бишкек
                Мирбек Атабеков
                 
                Кечки Бишкек — мен көргөн тагдырга болдуң себеп
                Музга айланган көңүлдүн дартына жообуң керек
                                
                Азыр кайда? Азыр кайда?
                Айтчы мага?
                Бакытка балкыган
                Жан дүйнөм чалкыган — жаным!
                                    
                Жалындаган, жараланган жүрөгүмдү
                Сен аны билбейсиң
                Сен аны сезбейсиң
                Сен мендей сүйбөйсүң — жаным!
                                    
                Суктанып караганың
                Көңүлдү баалап аяганың
                Андагы мамилеңди
                Мен кимден табаламын?
                                    
                Ой баскан санааларым
                Оорубас дүйнөм жараладың
                А балким, жолугуп мен
                Айткым келет сага баарын
                                    
                Кечки Бишкек — унутулгус күндөрдү кылдың белек
                Ал кездерде айттырбай түшүнүп жүргөн элек
                Жүргөн элек
                                    
                Азыр кайда? Азыр кайда?
                Айтчы мага?
                Бакытка балкыган
                Жан дүйнөм чалкыган — жаным!
                                    
                Жалындаган, жараланган абалымды
                Сен аны билбейсиң
                Сен аны сезбейсиң
                Сен мендей сүйбөйсүң — жаным!
                                    
                Суктанып караганың
                Көңүлдү баалап аяганың
                Андагы мамилеңди
                Мен кимден табаламын?
                                    
                Ой баскан санааларым
                Оорубас дүйнөм жараладың
                А балким, жолугуп мен
                Айткым келет сага баарын
                """);
        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);

        song.setTitle(scanner.nextLine());
        song.setAuthor(scanner.nextLine());

        StringBuilder text = new StringBuilder();
        while(scanner.hasNextLine()){
            text.append(scanner.nextLine()+"\n");
        }
        song.setText(text.toString());
        scanner.close();
        fileReader.close();

        System.out.println("\nЫрдын аты: " + song.getTitle());
        System.out.println("\nЫрдын автору: " + song.getAuthor());
        System.out.println("\nЫрдын тексти: \n" + song.getText());
    }
}