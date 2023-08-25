.class public final Lcom/daaw/w17;
.super Lcom/daaw/kz6;
.source ""


# instance fields
.field public final r:Lcom/daaw/y17;


# direct methods
.method public constructor <init>(Lcom/daaw/y17;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lcom/daaw/kz6;-><init>(II)V

    iput-object p1, p0, Lcom/daaw/w17;->r:Lcom/daaw/y17;

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/w17;->r:Lcom/daaw/y17;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
