/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;

/**
 *
 *  author dennisse
 *
 */
public class Facebook extends SocialClass implements Commentable{
    ArrayList<Comment> comentarios;

    public Facebook(String Username) {
        super(Username);
        comentarios = new ArrayList();
    }
    
    public boolean addComent(Comment comment){
        try{
            if(posts.size() > comment.getPostId())
                comentarios.add(comment);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public String timeline(){
        String texto = "";
        for(String post: posts){
            texto+= post + "\n   ";
            int contador = 1; 
            for(Comment comment: comentarios){
                if(posts.indexOf(post) == comment.getPostId()){
                    texto += contador + comment.print() +"\n";
                    contador++;
                }
            }
        }
        return texto;
    }
    
}
