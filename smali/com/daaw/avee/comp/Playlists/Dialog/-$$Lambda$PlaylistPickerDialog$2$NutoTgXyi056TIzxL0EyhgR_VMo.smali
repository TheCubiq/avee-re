.class public final synthetic Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$2$NutoTgXyi056TIzxL0EyhgR_VMo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/daaw/avee/Common/Action3;


# instance fields
.field private final synthetic f$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;

.field private final synthetic f$1:Lcom/daaw/avee/Common/Tuple2;

.field private final synthetic f$2:Z

.field private final synthetic f$3:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;Lcom/daaw/avee/Common/Tuple2;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$2$NutoTgXyi056TIzxL0EyhgR_VMo;->f$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;

    iput-object p2, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$2$NutoTgXyi056TIzxL0EyhgR_VMo;->f$1:Lcom/daaw/avee/Common/Tuple2;

    iput-boolean p3, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$2$NutoTgXyi056TIzxL0EyhgR_VMo;->f$2:Z

    iput-boolean p4, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$2$NutoTgXyi056TIzxL0EyhgR_VMo;->f$3:Z

    return-void
.end method


# virtual methods
.method public final onInvoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$2$NutoTgXyi056TIzxL0EyhgR_VMo;->f$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;

    iget-object v1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$2$NutoTgXyi056TIzxL0EyhgR_VMo;->f$1:Lcom/daaw/avee/Common/Tuple2;

    iget-boolean v2, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$2$NutoTgXyi056TIzxL0EyhgR_VMo;->f$2:Z

    iget-boolean v3, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$2$NutoTgXyi056TIzxL0EyhgR_VMo;->f$3:Z

    move-object v4, p1

    check-cast v4, [J

    move-object v5, p2

    check-cast v5, Ljava/util/ArrayList;

    move-object v6, p3

    check-cast v6, Ljava/util/ArrayList;

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;->lambda$onItemClick$0$PlaylistPickerDialog$2(Lcom/daaw/avee/Common/Tuple2;ZZ[JLjava/util/ArrayList;Ljava/util/ArrayList;)V

    return-void
.end method
