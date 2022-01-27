package com.example.postandstreetresponsejava;


import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;


public class PostViewModel extends AndroidViewModel {
    private PostRepository mPostRepository;
    public PostViewModel(@NonNull Application application) {
        super(application);
        mPostRepository  =new PostRepository(application);

    }
    public LiveData<List<PostModel>> getAllPosts(){

        return mPostRepository.getAllPro();
    }


}
