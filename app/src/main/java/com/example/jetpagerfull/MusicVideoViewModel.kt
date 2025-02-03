package com.example.jetpagerfull

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MusicVideoViewModel : ViewModel() {
    private val _videos = MutableLiveData(
        listOf(
            Video(
                videoUrl = "https://www.youtube.com/watch?v=VaKzNtwPQxE",
                thumbnailUrl = "https://www.example.com/thumbnail1.jpg",
                title = "Song 1",
                subtitle = "Artist 1"
            ),
            Video(
                videoUrl = "https://www.youtube.com/watch?v=VaKzNtwPQxE",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            ),
            Video(
                videoUrl = "https://www.youtube.com/watch?v=VaKzNtwPQxE",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            ),
            Video(
                videoUrl = "https://www.youtube.com/watch?v=VaKzNtwPQxE",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            ),
            Video(
                videoUrl = "https://www.youtube.com/watch?v=VaKzNtwPQxE",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            ),
            Video(
                videoUrl = "https://www.youtube.com/watch?v=VaKzNtwPQxE",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            ),
            Video(
                videoUrl = "https://www.youtube.com/watch?v=VaKzNtwPQxE",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            ),
            Video(
                videoUrl = "https://www.youtube.com/watch?v=VaKzNtwPQxE",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            ),
            Video(
                videoUrl = "https://www.youtube.com/watch?v=VaKzNtwPQxE",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            ),
            Video(
                videoUrl = "https://www.youtube.com/watch?v=VaKzNtwPQxE",
                thumbnailUrl = "https://www.example.com/thumbnail2.jpg",
                title = "Song 2",
                subtitle = "Artist 2"
            )
        )
    )

    val videos: LiveData<List<Video>> = _videos
}
