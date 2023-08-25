.class public final synthetic Lcom/daaw/np5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/em6;


# instance fields
.field public final synthetic a:Lcom/daaw/rp5;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/rp5;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/np5;->a:Lcom/daaw/rp5;

    iput-boolean p2, p0, Lcom/daaw/np5;->b:Z

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/np5;->a:Lcom/daaw/rp5;

    iget-boolean v1, p0, Lcom/daaw/np5;->b:Z

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/rp5;->a(ZLandroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;

    const/4 p1, 0x0

    return-object p1
.end method
