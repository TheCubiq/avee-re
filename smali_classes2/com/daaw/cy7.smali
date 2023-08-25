.class public final synthetic Lcom/daaw/cy7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/y08;


# instance fields
.field public final synthetic a:Lcom/daaw/h08;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/h08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cy7;->a:Lcom/daaw/h08;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/cy7;->a:Lcom/daaw/h08;

    invoke-virtual {v0}, Lcom/daaw/h08;->c()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
