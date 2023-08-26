package christophedelory.playlist;
/* loaded from: classes.dex */
public interface PlaylistVisitor {
    void beginVisitMedia(Media media) throws Exception;

    void beginVisitParallel(Parallel parallel) throws Exception;

    void beginVisitPlaylist(Playlist playlist) throws Exception;

    void beginVisitSequence(Sequence sequence) throws Exception;

    void endVisitMedia(Media media) throws Exception;

    void endVisitParallel(Parallel parallel) throws Exception;

    void endVisitPlaylist(Playlist playlist) throws Exception;

    void endVisitSequence(Sequence sequence) throws Exception;
}
