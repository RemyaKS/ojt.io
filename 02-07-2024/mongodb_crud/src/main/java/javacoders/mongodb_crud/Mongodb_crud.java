
package javacoders.mongodb_crud;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

public class Mongodb_crud {

   private static final String CONNECTION_STRING="mongodb://localhost:27017";
    private static final  String DATABASE_NAME="student";
    private static final String COLLECTION_NAME="student";
    public static void createStud(int studid,String studname,int studage,String place){
        try(MongoClient mc=MongoClients.create(CONNECTION_STRING)){
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            Document stud = new Document("id",studid).append("name",studname).
                    append("age",studage).append("place", place);
            col.insertOne(stud);
            System.out.println("Student details created: "+stud.toJson());
        }
    }
   public static void readStud() {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            FindIterable<Document> studs = col.find();
            System.out.println("stud details");
            for(Document javacoders:studs){
                System.out.println(javacoders.toJson());
            }
        }
    }
    
   public static void updateStud(int id,String studname){
       try(MongoClient mc=MongoClients.create(CONNECTION_STRING)){
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            
            col.updateOne(Filters.eq("id",id),Updates.set("name",studname));
            System.out.println("student name updated");
            
       }
   }
    public static void deleteStud(String studname){
       try(MongoClient mc=MongoClients.create(CONNECTION_STRING)){
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            
            col.deleteOne(Filters.eq("name",studname));
            System.out.println("student deleted");
            
       }
   }
    public static void main(String[] args) {
        //createStud(6,"Remya",23,"tvm");
        //createStud(7, "Miya", 23, "tvm");
        //readStud(6);
        //updateStud( 6,"Remya K S");
        //readStud();
        deleteStud("Miya S");
    }
}
