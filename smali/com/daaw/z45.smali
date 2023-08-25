.class public final synthetic Lcom/daaw/z45;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o84;


# instance fields
.field public final synthetic p:Lcom/daaw/i55;

.field public final synthetic q:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/i55;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/z45;->p:Lcom/daaw/i55;

    iput-object p2, p0, Lcom/daaw/z45;->q:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final zza(Z)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/z45;->p:Lcom/daaw/i55;

    iget-object v1, p0, Lcom/daaw/z45;->q:Ljava/util/Map;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/i55;->d(Ljava/util/Map;Z)V

    return-void
.end method
