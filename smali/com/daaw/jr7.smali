.class public abstract Lcom/daaw/jr7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static volatile d:I = 0x64

.field public static final synthetic e:I


# instance fields
.field public a:I

.field public final b:I

.field public c:Lcom/daaw/kr7;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/ir7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget p1, Lcom/daaw/jr7;->d:I

    iput p1, p0, Lcom/daaw/jr7;->b:I

    return-void
.end method

.method public static e(I)I
    .locals 1

    ushr-int/lit8 v0, p0, 0x1

    and-int/lit8 p0, p0, 0x1

    neg-int p0, p0

    xor-int/2addr p0, v0

    return p0
.end method

.method public static f(J)J
    .locals 4

    const/4 v0, 0x1

    ushr-long v0, p0, v0

    const-wide/16 v2, 0x1

    and-long/2addr p0, v2

    neg-long p0, p0

    xor-long/2addr p0, v0

    return-wide p0
.end method

.method public static g(Ljava/io/InputStream;I)Lcom/daaw/jr7;
    .locals 2

    new-instance p1, Lcom/daaw/hr7;

    const/16 v0, 0x1000

    const/4 v1, 0x0

    invoke-direct {p1, p0, v0, v1}, Lcom/daaw/hr7;-><init>(Ljava/io/InputStream;ILcom/daaw/gr7;)V

    return-object p1
.end method

.method public static h([BIIZ)Lcom/daaw/jr7;
    .locals 7

    new-instance v6, Lcom/daaw/ar7;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/daaw/ar7;-><init>([BIIZLcom/daaw/zq7;)V

    :try_start_0
    invoke-virtual {v6, p2}, Lcom/daaw/ar7;->l(I)I
    :try_end_0
    .catch Lcom/daaw/xs7; {:try_start_0 .. :try_end_0} :catch_0

    return-object v6

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public abstract A()Ljava/lang/String;
.end method

.method public abstract B(I)V
.end method

.method public abstract a(I)V
.end method

.method public abstract b()Z
.end method

.method public abstract c()Z
.end method

.method public abstract d(I)Z
.end method

.method public abstract i()D
.end method

.method public abstract j()F
.end method

.method public abstract k()I
.end method

.method public abstract l(I)I
.end method

.method public abstract m()I
.end method

.method public abstract n()I
.end method

.method public abstract o()I
.end method

.method public abstract p()I
.end method

.method public abstract q()I
.end method

.method public abstract r()I
.end method

.method public abstract s()I
.end method

.method public abstract t()J
.end method

.method public abstract u()J
.end method

.method public abstract v()J
.end method

.method public abstract w()J
.end method

.method public abstract x()J
.end method

.method public abstract y()Lcom/daaw/yq7;
.end method

.method public abstract z()Ljava/lang/String;
.end method
