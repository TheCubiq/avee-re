.class public Lcom/daaw/j7$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ww1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/j7;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ww1$a<",
        "Ljava/lang/String;",
        "Lcom/daaw/avee/comp/playback/b$c;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/j7;


# direct methods
.method public constructor <init>(Lcom/daaw/j7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j7$g;->a:Lcom/daaw/j7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/b$c;
    .locals 10

    new-instance p1, Lcom/daaw/avee/comp/playback/b$c;

    invoke-direct {p1}, Lcom/daaw/avee/comp/playback/b$c;-><init>()V

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->m0:I

    invoke-virtual {v0, v1}, Lcom/daaw/j5;->t(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lv;->b(Ljava/lang/String;)Lcom/daaw/lv;

    move-result-object v1

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v2, Lcom/daaw/j5;->R:I

    invoke-virtual {v0, v2}, Lcom/daaw/j5;->k(I)I

    move-result v0

    int-to-float v0, v0

    const v8, 0x3a83126f    # 0.001f

    mul-float v4, v0, v8

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v2, Lcom/daaw/j5;->S:I

    invoke-virtual {v0, v2}, Lcom/daaw/j5;->k(I)I

    move-result v0

    int-to-float v0, v0

    mul-float v5, v0, v8

    iget-object v0, v1, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    array-length v2, v0

    new-array v9, v2, [F

    array-length v0, v0

    new-array v7, v0, [F

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, v1, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    array-length v6, v3

    if-ge v2, v6, :cond_0

    aget-object v3, v3, v2

    iget v3, v3, Lcom/daaw/lv$a;->a:F

    aput v3, v7, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/daaw/j7$g;->a:Lcom/daaw/j7;

    invoke-static {v2}, Lcom/daaw/j7;->b(Lcom/daaw/j7;)Lcom/daaw/lv;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/j7$g;->a:Lcom/daaw/j7;

    invoke-static {v3}, Lcom/daaw/j7;->c(Lcom/daaw/j7;)Lcom/daaw/lv;

    move-result-object v3

    move-object v6, v9

    invoke-static/range {v1 .. v7}, Lcom/daaw/px;->b(Lcom/daaw/lv;Lcom/daaw/lv;Lcom/daaw/lv;FF[F[F)V

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v1

    sget v2, Lcom/daaw/j5;->B:I

    invoke-virtual {v1, v2}, Lcom/daaw/j5;->h(I)Z

    move-result v1

    iput-boolean v1, p1, Lcom/daaw/avee/comp/playback/b$c;->a:Z

    iput-boolean v0, p1, Lcom/daaw/avee/comp/playback/b$c;->b:Z

    const/4 v0, -0x1

    iput v0, p1, Lcom/daaw/avee/comp/playback/b$c;->c:I

    iput-object v9, p1, Lcom/daaw/avee/comp/playback/b$c;->d:[F

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->T:I

    invoke-virtual {v0, v1}, Lcom/daaw/j5;->k(I)I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, v8

    iput v0, p1, Lcom/daaw/avee/comp/playback/b$c;->e:F

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/j7$g;->a(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/b$c;

    move-result-object p1

    return-object p1
.end method
