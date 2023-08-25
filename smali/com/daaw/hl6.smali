.class public final synthetic Lcom/daaw/hl6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/jl6;

.field public final synthetic b:Lcom/daaw/bl6;

.field public final synthetic c:Lcom/daaw/fk6;

.field public final synthetic d:Lcom/daaw/cl6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/jl6;Lcom/daaw/bl6;Lcom/daaw/fk6;Lcom/daaw/cl6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hl6;->a:Lcom/daaw/jl6;

    iput-object p2, p0, Lcom/daaw/hl6;->b:Lcom/daaw/bl6;

    iput-object p3, p0, Lcom/daaw/hl6;->c:Lcom/daaw/fk6;

    iput-object p4, p0, Lcom/daaw/hl6;->d:Lcom/daaw/cl6;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 4

    iget-object v0, p0, Lcom/daaw/hl6;->a:Lcom/daaw/jl6;

    iget-object v1, p0, Lcom/daaw/hl6;->b:Lcom/daaw/bl6;

    iget-object v2, p0, Lcom/daaw/hl6;->c:Lcom/daaw/fk6;

    iget-object v3, p0, Lcom/daaw/hl6;->d:Lcom/daaw/cl6;

    check-cast p1, Lcom/daaw/qk6;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/daaw/jl6;->b(Lcom/daaw/bl6;Lcom/daaw/fk6;Lcom/daaw/cl6;Lcom/daaw/qk6;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
