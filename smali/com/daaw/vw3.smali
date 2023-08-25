.class public final synthetic Lcom/daaw/vw3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/yw3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/yw3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vw3;->a:Lcom/daaw/yw3;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vw3;->a:Lcom/daaw/yw3;

    check-cast p1, Ljava/util/Map;

    invoke-virtual {v0, p1}, Lcom/daaw/yw3;->c(Ljava/util/Map;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
