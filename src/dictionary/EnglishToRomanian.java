package dictionary;

import utils.FileUtils;

import java.util.List;

import static utils.FileUtils.fileLinesToList;

public interface EnglishToRomanian {


    public List<String> getEnglishLines(){

       retun FileUtils.fileLinesToList("Resource" , "dictionary" , "english_words.txt" , );

    }




}
