.class public Lcom/daaw/gd1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ke0;


# instance fields
.field public a:S

.field public b:I


# direct methods
.method public constructor <init>(SI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-short p1, p0, Lcom/daaw/gd1;->a:S

    iput p2, p0, Lcom/daaw/gd1;->b:I

    return-void
.end method


# virtual methods
.method public get(I)S
    .locals 0

    iget-short p1, p0, Lcom/daaw/gd1;->a:S

    return p1
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/daaw/gd1;->b:I

    return v0
.end method
