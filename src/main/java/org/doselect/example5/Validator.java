package org.doselect.example5;

import java.util.List;

public class Validator {

    String checkComment(String comment) throws Exception{
        String[] words = comment.split("\\s+");
        if(words.length > 2) return "acound ban due to spam comment";
        for(String word : words){
            if("abcde".equals(word) || "Imno".equals(word) || "pqrst".equals(word) || "wxyz".equals(word))
                throw new SpamCommentExeption("spam comment");
        }
        return "comment is not spam";
    }

    String commentTheString(String comment) throws Exception{
        try {
            String s = checkComment(comment);
        }catch (SpamCommentExeption e) {
            return e.getMessage();
        }catch (Exception e){ return "other exception";}
        return "comment posted";
    }
}
