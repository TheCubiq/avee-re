.class public final synthetic Lcom/daaw/an6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jw4;


# instance fields
.field public final synthetic a:Lcom/daaw/gm6;

.field public final synthetic b:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/gm6;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/an6;->a:Lcom/daaw/gm6;

    iput-object p2, p0, Lcom/daaw/an6;->b:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/an6;->a:Lcom/daaw/gm6;

    iget-object v1, p0, Lcom/daaw/an6;->b:Ljava/lang/Throwable;

    check-cast p1, Lcom/daaw/fn6;

    invoke-virtual {v0}, Lcom/daaw/gm6;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lcom/daaw/gm6;->b()Ljava/lang/String;

    move-result-object v0

    check-cast v2, Lcom/daaw/ym6;

    invoke-interface {p1, v2, v0, v1}, Lcom/daaw/fn6;->S(Lcom/daaw/ym6;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
