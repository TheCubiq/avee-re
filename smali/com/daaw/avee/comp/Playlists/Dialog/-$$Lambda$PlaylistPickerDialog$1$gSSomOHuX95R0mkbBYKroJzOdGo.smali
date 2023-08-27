.class public final synthetic Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$1$gSSomOHuX95R0mkbBYKroJzOdGo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/daaw/avee/Common/Action3;


# instance fields
.field private final synthetic f$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;

.field private final synthetic f$1:Landroid/app/Activity;

.field private final synthetic f$2:J

.field private final synthetic f$3:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;Landroid/app/Activity;JZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$1$gSSomOHuX95R0mkbBYKroJzOdGo;->f$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;

    iput-object p2, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$1$gSSomOHuX95R0mkbBYKroJzOdGo;->f$1:Landroid/app/Activity;

    iput-wide p3, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$1$gSSomOHuX95R0mkbBYKroJzOdGo;->f$2:J

    iput-boolean p5, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$1$gSSomOHuX95R0mkbBYKroJzOdGo;->f$3:Z

    return-void
.end method


# virtual methods
.method public final onInvoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$1$gSSomOHuX95R0mkbBYKroJzOdGo;->f$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;

    iget-object v1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$1$gSSomOHuX95R0mkbBYKroJzOdGo;->f$1:Landroid/app/Activity;

    iget-wide v2, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$1$gSSomOHuX95R0mkbBYKroJzOdGo;->f$2:J

    iget-boolean v4, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$1$gSSomOHuX95R0mkbBYKroJzOdGo;->f$3:Z

    move-object v5, p1

    check-cast v5, [J

    move-object v6, p2

    check-cast v6, Ljava/util/ArrayList;

    move-object v7, p3

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;->lambda$onItemClick$0$PlaylistPickerDialog$1(Landroid/app/Activity;JZ[JLjava/util/ArrayList;Ljava/util/ArrayList;)V

    return-void
.end method
