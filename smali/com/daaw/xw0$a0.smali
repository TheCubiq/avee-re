.class public Lcom/daaw/xw0$a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xw0;-><init>(Lcom/daaw/uf1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qw1$a<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/xw0;


# direct methods
.method public constructor <init>(Lcom/daaw/xw0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xw0$a0;->a:Lcom/daaw/xw0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;)V
    .locals 1

    sget-object v0, Lcom/daaw/avee/comp/playback/c;->j:Lcom/daaw/iw1;

    invoke-virtual {v0, p1}, Lcom/daaw/iw1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/daaw/xw0$a0;->a(Ljava/lang/Integer;)V

    return-void
.end method
