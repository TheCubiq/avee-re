.class public interface abstract Lchristophedelory/playlist/SpecificPlaylist;
.super Ljava/lang/Object;
.source "SpecificPlaylist.java"


# virtual methods
.method public abstract getProvider()Lchristophedelory/playlist/SpecificPlaylistProvider;
.end method

.method public abstract setProvider(Lchristophedelory/playlist/SpecificPlaylistProvider;)V
.end method

.method public abstract toPlaylist()Lchristophedelory/playlist/Playlist;
.end method

.method public abstract writeTo(Ljava/io/OutputStream;Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method
