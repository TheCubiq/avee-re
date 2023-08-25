.class public final synthetic Lcom/daaw/ps5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/rs5;

.field public final synthetic b:Landroid/net/Uri;

.field public final synthetic c:Lcom/daaw/fi6;

.field public final synthetic d:Lcom/daaw/th6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/rs5;Landroid/net/Uri;Lcom/daaw/fi6;Lcom/daaw/th6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ps5;->a:Lcom/daaw/rs5;

    iput-object p2, p0, Lcom/daaw/ps5;->b:Landroid/net/Uri;

    iput-object p3, p0, Lcom/daaw/ps5;->c:Lcom/daaw/fi6;

    iput-object p4, p0, Lcom/daaw/ps5;->d:Lcom/daaw/th6;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 4

    iget-object v0, p0, Lcom/daaw/ps5;->a:Lcom/daaw/rs5;

    iget-object v1, p0, Lcom/daaw/ps5;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/daaw/ps5;->c:Lcom/daaw/fi6;

    iget-object v3, p0, Lcom/daaw/ps5;->d:Lcom/daaw/th6;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/daaw/rs5;->c(Landroid/net/Uri;Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
