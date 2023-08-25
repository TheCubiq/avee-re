.class public final synthetic Lcom/daaw/lp8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic p:Lcom/daaw/gq8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/gq8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lp8;->p:Lcom/daaw/gq8;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lcom/daaw/lp8;->p:Lcom/daaw/gq8;

    sget v1, Lcom/daaw/hq8;->d:I

    invoke-interface {v0, p2}, Lcom/daaw/gq8;->zza(Ljava/lang/Object;)I

    move-result p2

    invoke-interface {v0, p1}, Lcom/daaw/gq8;->zza(Ljava/lang/Object;)I

    move-result p1

    sub-int/2addr p2, p1

    return p2
.end method
