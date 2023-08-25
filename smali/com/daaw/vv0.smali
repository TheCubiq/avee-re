.class public final Lcom/daaw/vv0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jk0$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/vv0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/jk0$c;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/pp;

.field public final b:I

.field public final c:Lcom/daaw/mp;

.field public final d:Lcom/daaw/vv0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vv0$a<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public volatile e:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public volatile f:J


# direct methods
.method public constructor <init>(Lcom/daaw/mp;Landroid/net/Uri;ILcom/daaw/vv0$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/mp;",
            "Landroid/net/Uri;",
            "I",
            "Lcom/daaw/vv0$a<",
            "+TT;>;)V"
        }
    .end annotation

    new-instance v0, Lcom/daaw/pp;

    const/4 v1, 0x3

    invoke-direct {v0, p2, v1}, Lcom/daaw/pp;-><init>(Landroid/net/Uri;I)V

    invoke-direct {p0, p1, v0, p3, p4}, Lcom/daaw/vv0;-><init>(Lcom/daaw/mp;Lcom/daaw/pp;ILcom/daaw/vv0$a;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/mp;Lcom/daaw/pp;ILcom/daaw/vv0$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/mp;",
            "Lcom/daaw/pp;",
            "I",
            "Lcom/daaw/vv0$a<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vv0;->c:Lcom/daaw/mp;

    iput-object p2, p0, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    iput p3, p0, Lcom/daaw/vv0;->b:I

    iput-object p4, p0, Lcom/daaw/vv0;->d:Lcom/daaw/vv0$a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    new-instance v0, Lcom/daaw/op;

    iget-object v1, p0, Lcom/daaw/vv0;->c:Lcom/daaw/mp;

    iget-object v2, p0, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    invoke-direct {v0, v1, v2}, Lcom/daaw/op;-><init>(Lcom/daaw/mp;Lcom/daaw/pp;)V

    :try_start_0
    invoke-virtual {v0}, Lcom/daaw/op;->q()V

    iget-object v1, p0, Lcom/daaw/vv0;->d:Lcom/daaw/vv0$a;

    iget-object v2, p0, Lcom/daaw/vv0;->c:Lcom/daaw/mp;

    invoke-interface {v2}, Lcom/daaw/mp;->d()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lcom/daaw/vv0$a;->a(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/vv0;->e:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lcom/daaw/op;->d()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/daaw/vv0;->f:J

    invoke-static {v0}, Lcom/daaw/sq1;->i(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lcom/daaw/op;->d()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/daaw/vv0;->f:J

    invoke-static {v0}, Lcom/daaw/sq1;->i(Ljava/io/Closeable;)V

    throw v1
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/vv0;->f:J

    return-wide v0
.end method

.method public final d()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/vv0;->e:Ljava/lang/Object;

    return-object v0
.end method
