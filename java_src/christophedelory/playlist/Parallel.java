package christophedelory.playlist;
/* loaded from: classes.dex */
public class Parallel extends AbstractTimeContainer {
    @Override // christophedelory.playlist.AbstractTimeContainer, christophedelory.playlist.AbstractPlaylistComponent
    public void acceptDown(PlaylistVisitor playlistVisitor) throws Exception {
        playlistVisitor.beginVisitParallel(this);
        super.acceptDown(playlistVisitor);
        playlistVisitor.endVisitParallel(this);
    }

    @Override // christophedelory.playlist.AbstractPlaylistComponent
    public void acceptUp(PlaylistVisitor playlistVisitor) throws Exception {
        playlistVisitor.beginVisitParallel(this);
        super.acceptUp(playlistVisitor);
        playlistVisitor.endVisitParallel(this);
    }
}
