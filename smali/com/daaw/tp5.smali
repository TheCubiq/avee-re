.class public final synthetic Lcom/daaw/tp5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Landroid/database/sqlite/SQLiteDatabase;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Lcom/daaw/p04;


# direct methods
.method public synthetic constructor <init>(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Lcom/daaw/p04;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/tp5;->p:Landroid/database/sqlite/SQLiteDatabase;

    iput-object p2, p0, Lcom/daaw/tp5;->q:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/tp5;->r:Lcom/daaw/p04;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/tp5;->p:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/daaw/tp5;->q:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/tp5;->r:Lcom/daaw/p04;

    invoke-static {v0, v1, v2}, Lcom/daaw/cq5;->D(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Lcom/daaw/p04;)V

    return-void
.end method
