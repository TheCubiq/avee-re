.class public Lcom/daaw/avee/comp/playback/a$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ke0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/a;->j(II[S)Lcom/daaw/ke0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:[S

.field public final synthetic c:I


# direct methods
.method public constructor <init>(I[SI)V
    .locals 0

    iput p1, p0, Lcom/daaw/avee/comp/playback/a$f;->a:I

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/a$f;->b:[S

    iput p3, p0, Lcom/daaw/avee/comp/playback/a$f;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(I)S
    .locals 4

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/a$f;->b:[S

    iget v1, p0, Lcom/daaw/avee/comp/playback/a$f;->c:I

    mul-int v2, p1, v1

    aget-short v2, v0, v2

    mul-int v3, p1, v1

    add-int/lit8 v3, v3, 0x1

    aget-short v3, v0, v3

    add-int/2addr v2, v3

    mul-int v3, p1, v1

    add-int/lit8 v3, v3, 0x2

    aget-short v3, v0, v3

    add-int/2addr v2, v3

    mul-int p1, p1, v1

    add-int/lit8 p1, p1, 0x3

    aget-short p1, v0, p1

    add-int/2addr v2, p1

    div-int/lit8 v2, v2, 0x4

    int-to-short p1, v2

    return p1
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/daaw/avee/comp/playback/a$f;->a:I

    return v0
.end method
