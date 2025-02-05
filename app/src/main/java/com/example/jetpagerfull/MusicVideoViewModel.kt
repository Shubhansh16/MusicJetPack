package com.example.jetpagerfull

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MusicVideoViewModel : ViewModel() {
    private val _videos = MutableLiveData(
        listOf(
            Video(
               "https://file-examples.com/storage/fed070a54267a0d1f9ebf9a/2017/04/file_example_MP4_1280_10MG.mp4",
                thumbnailUrl = "https://www.example.com/thumbnail1.jpg",
                title = "Song 1",
                subtitle = "Artist 1"
            ),
            Video(
                videoUrl = "https://file-examples.com/storage/fed070a54267a0d1f9ebf9a/2017/04/file_example_MP4_1280_10MG.mp4",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            ),
            Video(
                videoUrl = "https://file-examples.com/storage/fed070a54267a0d1f9ebf9a/2017/04/file_example_MP4_1280_10MG.mp4",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            ),
            Video(
                videoUrl = "https://file-examples.com/storage/fed070a54267a0d1f9ebf9a/2017/04/file_example_MP4_1280_10MG.mp4",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            ),
            Video(
                videoUrl = "https://file-examples.com/storage/fed070a54267a0d1f9ebf9a/2017/04/file_example_MP4_1280_10MG.mp4",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            ),
            Video(
                videoUrl = "https://file-examples.com/storage/fed070a54267a0d1f9ebf9a/2017/04/file_example_MP4_1280_10MG.mp4",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            ),
            Video(
                videoUrl = "https://file-examples.com/storage/fed070a54267a0d1f9ebf9a/2017/04/file_example_MP4_1280_10MG.mp4",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            ),
            Video(
                videoUrl = "https://file-examples.com/storage/fed070a54267a0d1f9ebf9a/2017/04/file_example_MP4_1280_10MG.mp4",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            ),
            Video(
                videoUrl = "https://file-examples.com/storage/fed070a54267a0d1f9ebf9a/2017/04/file_example_MP4_1280_10MG.mp4",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            ),
            Video(
                videoUrl = "https://file-examples.com/storage/fed070a54267a0d1f9ebf9a/2017/04/file_example_MP4_1280_10MG.mp4",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            )
        )
    )

    val videos: LiveData<List<Video>> = _videos
}
