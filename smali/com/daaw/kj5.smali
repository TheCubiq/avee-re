.class public final synthetic Lcom/daaw/kj5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/nj5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/nj5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kj5;->a:Lcom/daaw/nj5;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 1

    iget-object v0, p0, Lcom/daaw/kj5;->a:Lcom/daaw/nj5;

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Lcom/daaw/nj5;->c(Ljava/io/InputStream;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
