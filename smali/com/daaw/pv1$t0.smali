.class public Lcom/daaw/pv1$t0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/xw1$a<",
        "Lcom/daaw/avee/comp/playback/a;",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/comp/playback/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pv1;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$t0;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/avee/comp/playback/a;Ljava/lang/Integer;)Lcom/daaw/avee/comp/playback/a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pv1$t0;->a:Lcom/daaw/pv1;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p2, p1}, Lcom/daaw/pv1;->F(Lcom/daaw/pv1;ILcom/daaw/avee/comp/playback/a;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/avee/comp/playback/a;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/pv1$t0;->a(Lcom/daaw/avee/comp/playback/a;Ljava/lang/Integer;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    return-object p1
.end method
