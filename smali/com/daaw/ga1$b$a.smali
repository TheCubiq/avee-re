.class public Lcom/daaw/ga1$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ie0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ga1$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ga1$b;


# direct methods
.method public constructor <init>(Lcom/daaw/ga1$b;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ga1$b$a;->a:Lcom/daaw/ga1$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(I)D
    .locals 7

    iget-object v0, p0, Lcom/daaw/ga1$b$a;->a:Lcom/daaw/ga1$b;

    iget-object v0, v0, Lcom/daaw/ga1$b;->U:[D

    mul-int/lit8 p1, p1, 0x2

    aget-wide v1, v0, p1

    aget-wide v3, v0, p1

    mul-double v1, v1, v3

    add-int/lit8 p1, p1, 0x1

    aget-wide v3, v0, p1

    aget-wide v5, v0, p1

    mul-double v3, v3, v5

    add-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga1$b$a;->a:Lcom/daaw/ga1$b;

    iget-object v0, v0, Lcom/daaw/ga1$b;->U:[D

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    return v0
.end method
