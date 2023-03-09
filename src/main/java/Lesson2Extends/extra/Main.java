package Lesson2Extends.extra;

import Lesson2Extends.extra.Models.Comment;
import Lesson2Extends.extra.Models.Post;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(1,1,"sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit nsuscipit recusandae consequuntur expedita et cum nreprehenderit molestiae ut ut quas totam nnostrum rerum est autem sunt rem eveniet architecto",new ArrayList<>()));
        posts.add(new Post(1,2,"qui est esse","est rerum tempore vitae nsequi sint nihil reprehenderit dolor beatae ea dolores neque nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis nqui aperiam non debitis possimus qui neque nisi nulla",new ArrayList<>()));
        posts.add(new Post(1,3,"ea molestias quasi exercitationem repellat qui ipsa sit aut","et iusto sed quo iure nvoluptatem occaecati omnis eligendi aut ad nvoluptatem doloribus vel accusantium quis pariatur nmolestiae porro eius odio et labore et velit aut",new ArrayList<>()));


        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(new Comment(1,1,"id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium"));
        comments.add(new Comment(1,2,"quo vero reiciendis velit similique earum","Jayne_Kuhic@sydney.com","est natus enim nihil est dolore omnis voluptatem numquam"));
        comments.add(new Comment(1,3,"odio adipisci rerum aut animi","Nikita@garfield.biz","quia molestiae rep"));
        comments.add(new Comment(2,7,"repellat consequatur praesentium","Dallas@ole.me","et inventore et\\nquasi"));
        comments.add(new Comment(2,8,"et omnis d","Mallory_Kunze@marie.org","em corrupti velit\\nad voluptatem ma"));
        comments.add(new Comment(3,13," non paria","Kariane@jadyn.tv","rerum\\ninventore corporis exercitationem"));
        comments.add(new Comment(3,14,"aesentium hic aut","Nathan@solon.io","oluptatibus unde se"));
        comments.add(new Comment(3,15,"c odit aut","Maynard.Hodkiewicz@roberta.com","o dicta rerum\\nquisquam saepe et est"));

        for (Post post : posts) {

            int postId = post.getId();
            ArrayList<Comment> postComments = new ArrayList<>();

            for (Comment comment : comments) {
                if(comment.getPostId() == postId){
                    postComments.add(comment);
                }
            }

            post.setComments(postComments);

            System.out.println(postComments);

        }


    }

}
