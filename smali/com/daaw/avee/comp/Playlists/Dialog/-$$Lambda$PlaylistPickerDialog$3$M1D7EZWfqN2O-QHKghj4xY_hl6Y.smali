.class public final synthetic Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$3$M1D7EZWfqN2O-QHKghj4xY_hl6Y;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/daaw/avee/Common/Action3;


# instance fields
.field private final synthetic f$0:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$3$M1D7EZWfqN2O-QHKghj4xY_hl6Y;->f$0:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final onInvoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$3$M1D7EZWfqN2O-QHKghj4xY_hl6Y;->f$0:Landroid/app/Activity;

    check-cast p1, [J

    check-cast p2, Ljava/util/ArrayList;

    check-cast p3, Ljava/util/ArrayList;

    invoke-static {v0, p1, p2, p3}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$3;->lambda$onClick$0(Landroid/app/Activity;[JLjava/util/ArrayList;Ljava/util/ArrayList;)V

    return-void
.end method
