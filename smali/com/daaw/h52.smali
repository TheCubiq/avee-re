.class public final Lcom/daaw/h52;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/v42;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/h52;->a:I

    iput p2, p0, Lcom/daaw/h52;->b:I

    iput p3, p0, Lcom/daaw/h52;->c:I

    return-void
.end method

.method public static a(Lcom/daaw/ik5;)Lcom/daaw/h52;
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/ik5;->o()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {p0, v1}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->o()I

    move-result v1

    invoke-virtual {p0}, Lcom/daaw/ik5;->o()I

    move-result v2

    const/4 v3, 0x4

    invoke-virtual {p0, v3}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->o()I

    move-result v3

    const/16 v4, 0xc

    invoke-virtual {p0, v4}, Lcom/daaw/ik5;->g(I)V

    new-instance p0, Lcom/daaw/h52;

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/daaw/h52;-><init>(IIII)V

    return-object p0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const v0, 0x68697661

    return v0
.end method
