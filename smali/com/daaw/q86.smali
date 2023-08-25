.class public final synthetic Lcom/daaw/q86;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/r86;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r86;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/q86;->a:Lcom/daaw/r86;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 1

    iget-object v0, p0, Lcom/daaw/q86;->a:Lcom/daaw/r86;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, p1}, Lcom/daaw/r86;->a(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
