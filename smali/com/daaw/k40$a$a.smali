.class public Lcom/daaw/k40$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/database/DatabaseErrorHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/k40$a;-><init>(Landroid/content/Context;Ljava/lang/String;[Lcom/daaw/j40;Lcom/daaw/ki1$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ki1$a;

.field public final synthetic b:[Lcom/daaw/j40;


# direct methods
.method public constructor <init>(Lcom/daaw/ki1$a;[Lcom/daaw/j40;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/k40$a$a;->a:Lcom/daaw/ki1$a;

    iput-object p2, p0, Lcom/daaw/k40$a$a;->b:[Lcom/daaw/j40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCorruption(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/k40$a$a;->a:Lcom/daaw/ki1$a;

    iget-object v1, p0, Lcom/daaw/k40$a$a;->b:[Lcom/daaw/j40;

    invoke-static {v1, p1}, Lcom/daaw/k40$a;->n([Lcom/daaw/j40;Landroid/database/sqlite/SQLiteDatabase;)Lcom/daaw/j40;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/ki1$a;->c(Lcom/daaw/ji1;)V

    return-void
.end method
