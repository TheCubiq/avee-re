.class public Lcom/daaw/ew0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ow1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ew0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ow1$a<",
        "Lcom/daaw/avee/comp/playback/a;",
        "Lcom/daaw/avee/comp/playback/a$g;",
        "Lcom/daaw/avee/comp/playback/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ew0;


# direct methods
.method public constructor <init>(Lcom/daaw/ew0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ew0$e;->a:Lcom/daaw/ew0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/avee/comp/playback/a;Lcom/daaw/avee/comp/playback/a$g;)Lcom/daaw/avee/comp/playback/a;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ew0$e;->a:Lcom/daaw/ew0;

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Lcom/daaw/ew0;->e(Lcom/daaw/ew0;Lcom/daaw/avee/comp/playback/a;Lcom/daaw/avee/comp/playback/a$g;Z)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/avee/comp/playback/a;

    check-cast p2, Lcom/daaw/avee/comp/playback/a$g;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ew0$e;->a(Lcom/daaw/avee/comp/playback/a;Lcom/daaw/avee/comp/playback/a$g;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    return-object p1
.end method
