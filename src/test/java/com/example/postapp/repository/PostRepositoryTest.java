// package com.example.postapp.repository;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.cglib.core.Local;
// import org.springframework.data.domain.PageRequest;
// import org.springframework.test.annotation.Rollback;
// import org.springframework.transaction.annotation.Transactional;

// import com.example.postapp.domain.Attachment;
// import com.example.postapp.domain.Post;
// import com.example.postapp.dto.PageRequestDto;

// import lombok.extern.slf4j.Slf4j;

// import static org.junit.jupiter.api.Assertions.*;

// import java.time.LocalDateTime;
// import java.util.List;
// import java.util.NoSuchElementException;
// import java.util.Optional;

// @SpringBootTest
// @Transactional
// @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
// @Slf4j
// public class PostRepositoryTest {

//     //Dependecies injection 의존성주입
//     @Autowired
//     private PostRepository postRepository;

//     @Test
//     public void test(){
//         assertNotNull(postRepository);
//     }

//     @Test 
//     @Rollback(false)
//     public void testSave(){
//         //given
//         //when
//         Post post =new Post();
//         post.setTitle("title1");
//         post.setContents("contents1");
//         post.setWriter("writer1");
//         post.setRegDate(LocalDateTime.now());
        
//         Post savedPost = postRepository.save(post);
//         log.info("savedPost id: {} ", savedPost.getId());

//         //then
//         // assertThrows(NoSuchElementException.class, () ->{
//         //     //Optional <Post> result = postRepository.findById(savedPost.getId().intValue()); //오류
//         //     Optional <Post> result = postRepository.findById(1000); //exception 발생
//         //     result.orElseThrow();
//         // });

//         assertDoesNotThrow(() ->{
//             Optional <Post> result = postRepository.findById(savedPost.getId().intValue()); //오류
//           //  Optional <Post> result = postRepository.findById(1000); //exception 발생
//             result.orElseThrow();
//         });
//     }

//         //게시글 상세 조회
//         @Test
//         public void testFindById(){
//             //given
//             Long id = 1L;
//             //when
           
//             //then
            
//         assertDoesNotThrow(() ->{
//             Optional <Post> result =postRepository.findById(id.intValue());
//             Post post = result.orElseThrow();
//             log.info("post: {}", post);
//         });
//     }
       
       
    

  
 
//    // @BeforeEach
//     // @Test 
//     // @Rollback(false)
//     // public void test1(){

//     //     Post post = new Post();
//     //     post.changeTitle("title1");
//     //     post.changeContents("contents1");
//     //     post.changeWriter("writer1");
//     //     post.changeRegDate(LocalDateTime.now());
//     //     post.addFiles(new Attachment("a.txt","/upload", 100));
//     //     post.addFiles(new Attachment("b.txt","/upload", 200));
//     //     postRepository.save(post);

//     //     Post post1 = new Post();
//     //     post1.changeTitle("title2");
//     //     post1.changeContents("contents2");
//     //     post1.changeWriter("writer2");
//     //     post1.changeRegDate(LocalDateTime.now());
//     //     post1.addFiles(new Attachment("c.txt","/upload", 300));
//     //     postRepository.save(post1);

//     //     Post post3 = new Post();
//     //     post3.changeTitle("title3");
//     //     post3.changeContents("contents3");
//     //     post3.changeWriter("writer3");
//     //     post3.changeRegDate(LocalDateTime.now());
//     //     postRepository.save(post3);
//     // }

   
//     @Test
//     @Rollback(false)
//     public void testSave1(){

//         //given
//         for (int i =1; i < 30; i++){
//             Post post = new Post();
//             post.changeTitle("title" + i);
//             post.changeContents("contents" + i);
//             post.changeWriter("writer" + i);
//             post.changeRegDate(LocalDateTime.now());

//             postRepository.save(post);
    
     

//         //when
//         //  postRepository.save(i);

//         //then
//         assertTrue(post.getId() > 0);
//         log.info("id : {}", post.getId());

//     }
// }

//     // @Test
//     // public void testFindById(){
//     //     //given
//     //     int id =2;

//     //     //when
//     //     Optional<Post> result= postRepository.findById(id);

//     //     Post post = result.orElseThrow();
//     //     log.info("id ; {}, title :{},", post.getId(), post.getTitle());


//         // assertThrows(IllegalArgumentException.class, ()-> {

//         //     Post post = result.orElseThrow(()-> {

//         //         throw new IllegalArgumentException("게시글 정보가 존재하지 않습니다.");
//         //     });

//         //    
//         // });

//         //then

// //     }

// //     @Test
// //     public void testFindAll(){
// //         //given
// //         //when
// //         List<Post> posts = postRepository.findAll();

// //         //then
// //         assertTrue(posts.size() > 0);

// //         posts.forEach(post -> {
// //             log.info("id : {}, title: {}", post.getId(), post.getTitle());
// //         });

// //     }

// //     @Test
// //     @Rollback(false)
// //     public void testUpdate(){
// //         //given
// //         int id =2;

// //         Optional<Post> result = postRepository.findById(id);
// //         Post post = result.orElseThrow();

// //         //when
// //         post.changeWriter("writer수정");
// //         post.changeTitle("tittle수정");
// //         post.changeContents("contents 수정");
// //         post.changeRegDate(LocalDateTime.now());

// //         //then
// //         assertEquals(post.getTitle(), "tittle수정");
// //     }

// //     @Test
// //     @Rollback(false)
// //     public void testDelete(){
// //         //given
// //         int id =3;
// //         Optional<Post> result = postRepository.findById(id);
// //         Post post = result.orElseThrow();

// //         //when
// //         postRepository.delete(post);

// //         //then
// //         assertThrows(IllegalArgumentException.class, () -> {
// //             Optional<Post> result1 = postRepository.findById(id);
// //             result1.orElseThrow(()->{
// //                 throw new IllegalArgumentException("게시글 정보가 존재하지 않습니다.");
// //             });
               
// //         });
// //     }

// //     @Test
// //     @Rollback(false)
// //     public void testFindAllByTitle(){
// //         //given
// //         String titleStr = "title1";

// //         //when
// //         List<Post> posts =postRepository.findAllByTitle(titleStr);
// //         //then
// //         assertTrue(posts.size() > 0);

// //         posts.forEach(post -> {
// //             log.info("id: {}, title: {}", post.getId(), post.getTitle());
// //         });
// // }

// //     @Test
// //     @Rollback(false)
// //     public void testFindAllByTitle1(){
// //         //given
// //         String titleStr = "title1";

// //         //when
// //         List<Object[]> posts =postRepository.findAllByTitle1(titleStr);

// //         //then
// //         assertTrue(posts.size() > 0);

// //         for (Object [] post : posts){
// //             log.info("id: {}, title:{}, writer:{}", post[0],post[1],post[2]);
// //         }
// // }

// //     @Test
// //         @Rollback(false)
// //         public void testGetTotalCount(){

// //             long count = postRepository.getTotalCount();

// //             log.info("count : {}", count);

// //         }

        
// //     @Test
// //     @Rollback(false)
// //     public void testPaging(){
// //         //given
// //         PageRequestDto pageRequestDto = PageRequestDto.builder()
// //                        .page(2)
// //                        .size(10)
// //                        .build();

// //         log.info("page: {}, size: {}", pageRequestDto.getPage(), pageRequestDto.getSize());
// //         //when
// //         List<Post> posts = postRepository.paging(pageRequestDto);
// //         //then
// //         assertEquals(posts.size(), 10);

// //         posts.forEach(post -> {
// //             log.info("id: {}, title: {}", post.getId(), post.getTitle());
// //         });
// // }

//     // @Test
//     // public void testFindAlls(){
//     //     //given
//     //     //when
//     //     List<Post> posts =postRepository.findAlls();

//     //     //then
//     //     posts.forEach(post -> {
//     //         log.info("id : {}, title: {}, filename: {}", post.getId(), post.getTitle(), post.getFiles().get(0).getFilename());
//     //     });
//     // }

//     // @Test 
//     // public void testGetFileCount(){
//     //     //given
//     //     Long id =1L;
//     //     //when
//     //     int count = postRepository.getFileCount(id);
//     //     //then
//     //     assertTrue(count > 0);
//     //     log.info("count: {}", count);
//     // }

//     // @Test
//     // public void testFindPostAll(){
//     //     //given
//     //     //when
//     //     List<Object[]> posts = postRepository.findPostAll();
//     //     //then
//     //     for(Object[] post : posts){
//     //         log.info("id: {}, title: {}, fileCount: {}, filename :{}", post[0],post[1],post[2], post[3]);
//     //     }
//     // }
// }
