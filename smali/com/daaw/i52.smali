.class public final Lcom/daaw/i52;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/v42;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>(IIIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/i52;->a:I

    iput p3, p0, Lcom/daaw/i52;->b:I

    iput p4, p0, Lcom/daaw/i52;->c:I

    iput p5, p0, Lcom/daaw/i52;->d:I

    iput p6, p0, Lcom/daaw/i52;->e:I

    return-void
.end method

.method public static a(Lcom/daaw/ik5;)Lcom/daaw/i52;
    .locals 7

    invoke-virtual {p0}, Lcom/daaw/ik5;->o()I

    move-result v1

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->o()I

    move-result v2

    invoke-virtual {p0}, Lcom/daaw/ik5;->o()I

    move-result v3

    invoke-virtual {p0}, Lcom/daaw/ik5;->o()I

    move-result v4

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->o()I

    move-result v5

    invoke-virtual {p0}, Lcom/daaw/ik5;->o()I

    move-result v6

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->g(I)V

    new-instance p0, Lcom/daaw/i52;

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/daaw/i52;-><init>(IIIIII)V

    return-object p0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const v0, 0x68727473

    return v0
.end method
