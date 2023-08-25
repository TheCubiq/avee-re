.class public Lcom/daaw/tc1$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ku$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/tc1$b;->a(Lcom/daaw/ir1;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/tc1$b;


# direct methods
.method public constructor <init>(Lcom/daaw/tc1$b;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tc1$b$a;->a:Lcom/daaw/tc1$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/io/FileOutputStream;
    .locals 4

    new-instance v0, Ljava/io/FileOutputStream;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/daaw/tc1$b$a;->a:Lcom/daaw/tc1$b;

    iget-object v2, v2, Lcom/daaw/tc1$b;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/tc1$b$a;->a:Lcom/daaw/tc1$b;

    iget-object v3, v3, Lcom/daaw/tc1$b;->b:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    return-object v0
.end method
