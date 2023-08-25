.class public final Lcom/daaw/eb0$a;
.super Lcom/daaw/dp;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/eb0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final l:Ljava/lang/String;

.field public m:[B


# direct methods
.method public constructor <init>(Lcom/daaw/mp;Lcom/daaw/pp;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;[BLjava/lang/String;)V
    .locals 8

    const/4 v3, 0x3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/daaw/dp;-><init>(Lcom/daaw/mp;Lcom/daaw/pp;ILcom/google/android/exoplayer2/Format;ILjava/lang/Object;[B)V

    iput-object p7, p0, Lcom/daaw/eb0$a;->l:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public e([BI)V
    .locals 0

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/eb0$a;->m:[B

    return-void
.end method

.method public h()[B
    .locals 1

    iget-object v0, p0, Lcom/daaw/eb0$a;->m:[B

    return-object v0
.end method
