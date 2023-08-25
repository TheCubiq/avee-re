.class public Lcom/daaw/cx0$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/cx0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qw1$a<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/cx0;


# direct methods
.method public constructor <init>(Lcom/daaw/cx0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/cx0$g;->a:Lcom/daaw/cx0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Long;)V
    .locals 1

    sget-object v0, Lcom/daaw/avee/comp/playback/c;->i:Lcom/daaw/iw1;

    invoke-virtual {v0, p1}, Lcom/daaw/iw1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/daaw/cx0$g;->a(Ljava/lang/Long;)V

    return-void
.end method
