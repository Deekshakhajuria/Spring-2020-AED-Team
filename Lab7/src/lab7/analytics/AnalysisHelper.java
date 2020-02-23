/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author A Team Has No Name
 */
public class AnalysisHelper {
    
    //find average number of likes per comment:
    
    public void getAvgNumberOfLikesPerComment() {
        
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();

        int avgLikes = 0;
        for (Comment c : comments.values()) {
            avgLikes += c.getLikes();
        }

        int avg = avgLikes / comments.size();
        
        System.out.println("--------------------------------Task 1-------------------------------");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("(I) Average Number of Likes Per Comment: " + avg);
        

    }
    
    //find the post with most liked comments
    
     public void getPostWithMostLikedComments() {
         
        Map<Integer, Comment> comment = DataStore.getInstance().getComments();
        int maxlike = Integer.MIN_VALUE;
        int maxId = 0;

        for (Comment c : comment.values()) {

            int count = c.getLikes();

            if (count > maxlike) {
                maxlike = count;
                maxId = c.getPostId();
            }

        }
        
        System.out.println("------------------------------Task 2--------------------------------");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("(II) Post with most liked comments: " + maxId + " Total number of comments: " + maxlike);
     }
    
     
     public void getPostWithMostComments() {

        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        int max = Integer.MIN_VALUE;
        int maxId = 0;

        for (Post p : posts.values()) {
            int count = p.getComments().size();

            if (count > max) {

                max = count;
                maxId = p.getPostId();

            }

        }

        System.out.println("------------------------------Task 3--------------------------------");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("(III) Post with most comments: " + maxId + " Total number of comments: " + max);
     }
     
    
    // find user with Most Likes
    //  key: UserId ; Value: sum of likes from all comments
    public void userWithMostLikes() {
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
    
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()) {
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes: " + max + "\n" 
            + users.get(maxId));
    }
    
    // find 5 comments which have the most likes
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        
        System.out.println("5 most likes comments: ");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }
}
