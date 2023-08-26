.class public interface abstract Lchristophedelory/playlist/SpecificPlaylistProvider;
.super Ljava/lang/Object;
.source "SpecificPlaylistProvider.java"


# virtual methods
.method public abstract getContentTypes()[Lmychristophedelory/content/type/ContentType;
.end method

.method public abstract getId()Ljava/lang/String;
.end method

.method public abstract readFrom(Ljava/io/InputStream;Ljava/lang/String;Lorg/myapache/commons/logging/Log;)Lchristophedelory/playlist/SpecificPlaylist;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public abstract toSpecificPlaylist(Lchristophedelory/playlist/Playlist;)Lchristophedelory/playlist/SpecificPlaylist;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method
