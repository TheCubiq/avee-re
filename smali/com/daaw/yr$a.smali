.class public final Lcom/daaw/yr$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/we1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/daaw/mp$a;


# direct methods
.method public constructor <init>(Lcom/daaw/mp$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yr$a;->a:Lcom/daaw/mp$a;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/lk0;Lcom/daaw/xe1;ILcom/google/android/exoplayer2/trackselection/c;[Lcom/daaw/pm1;)Lcom/daaw/we1;
    .locals 8

    iget-object v0, p0, Lcom/daaw/yr$a;->a:Lcom/daaw/mp$a;

    invoke-interface {v0}, Lcom/daaw/mp$a;->a()Lcom/daaw/mp;

    move-result-object v6

    new-instance v0, Lcom/daaw/yr;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lcom/daaw/yr;-><init>(Lcom/daaw/lk0;Lcom/daaw/xe1;ILcom/google/android/exoplayer2/trackselection/c;Lcom/daaw/mp;[Lcom/daaw/pm1;)V

    return-object v0
.end method
