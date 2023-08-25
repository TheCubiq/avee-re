.class public final synthetic Lcom/daaw/ce6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/fe6;

.field public final synthetic b:Lcom/daaw/df6;

.field public final synthetic c:Lcom/daaw/ee6;

.field public final synthetic d:Lcom/daaw/ye6;

.field public final synthetic e:Lcom/daaw/rp4;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/fe6;Lcom/daaw/df6;Lcom/daaw/ee6;Lcom/daaw/ye6;Lcom/daaw/rp4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ce6;->a:Lcom/daaw/fe6;

    iput-object p2, p0, Lcom/daaw/ce6;->b:Lcom/daaw/df6;

    iput-object p3, p0, Lcom/daaw/ce6;->c:Lcom/daaw/ee6;

    iput-object p4, p0, Lcom/daaw/ce6;->d:Lcom/daaw/ye6;

    iput-object p5, p0, Lcom/daaw/ce6;->e:Lcom/daaw/rp4;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 6

    iget-object v0, p0, Lcom/daaw/ce6;->a:Lcom/daaw/fe6;

    iget-object v1, p0, Lcom/daaw/ce6;->b:Lcom/daaw/df6;

    iget-object v2, p0, Lcom/daaw/ce6;->c:Lcom/daaw/ee6;

    iget-object v3, p0, Lcom/daaw/ce6;->d:Lcom/daaw/ye6;

    iget-object v4, p0, Lcom/daaw/ce6;->e:Lcom/daaw/rp4;

    move-object v5, p1

    check-cast v5, Lcom/daaw/ke6;

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/fe6;->c(Lcom/daaw/df6;Lcom/daaw/ee6;Lcom/daaw/ye6;Lcom/daaw/rp4;Lcom/daaw/ke6;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
